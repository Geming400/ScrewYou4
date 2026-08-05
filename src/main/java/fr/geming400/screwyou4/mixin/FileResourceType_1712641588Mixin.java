package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.access.FileResourceType.class)
public class FileResourceType_1712641588Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/nio/file/Path;I)Ljava/lang/AutoCloseable;", cancellable = true)
    private void create__717300866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-717300866L))
            info.setReturnValue(null);
    }


}

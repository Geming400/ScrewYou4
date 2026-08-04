package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.IndexedAssetSource.class)
public class IndexedAssetSource_1691871744Mixin {
        @Inject(at = @At("HEAD"), method = "createIndexFs(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/nio/file/Path;", cancellable = true)
    private static void createIndexFs_780841100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(780841100L))
            info.setReturnValue(null);
    }


}

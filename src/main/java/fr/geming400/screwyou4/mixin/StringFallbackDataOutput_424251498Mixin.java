package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.NbtIo.StringFallbackDataOutput.class)
public class StringFallbackDataOutput_424251498Mixin {
        @Inject(at = @At("HEAD"), method = "writeUTF(Ljava/lang/String;)V", cancellable = true)
    private void writeUTF__168210210(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-168210210L))
            info.cancel();
    }


}

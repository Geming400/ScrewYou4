package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.access.SavedDataNbt.class)
public class SavedDataNbt_932668105Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lcom/mojang/serialization/Dynamic;)V", cancellable = true)
    private void write__2031083270(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2031083270L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read()Ljava/util/Optional;", cancellable = true)
    private void read_1988119564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1988119564L))
            info.setReturnValue(null);
    }


}

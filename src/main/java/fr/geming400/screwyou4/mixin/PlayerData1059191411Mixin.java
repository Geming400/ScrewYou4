package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.access.PlayerData.class)
public class PlayerData1059191411Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lcom/mojang/serialization/Dynamic;)V", cancellable = true)
    private void write__1904559963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1904559963L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read()Ljava/util/Optional;", cancellable = true)
    private void read_2114642871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2114642871L))
            info.setReturnValue(null);
    }


}

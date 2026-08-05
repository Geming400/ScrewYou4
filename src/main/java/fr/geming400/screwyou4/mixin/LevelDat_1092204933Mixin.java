package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.access.LevelDat.class)
public class LevelDat_1092204933Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lcom/mojang/serialization/Dynamic;)V", cancellable = true)
    private void write__1871546442(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1871546442L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read()Ljava/util/Optional;", cancellable = true)
    private void read__2147310904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2147310904L))
            info.setReturnValue(null);
    }


}

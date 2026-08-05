package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration.class)
public class SimpleBlockConfiguration667303355Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2052815614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2052815614L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__468156620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-468156620L))
            info.setReturnValue("V<aC*Zfcy?颗赘,b8k尫%6%U'6∥F'e簾bFBh⥻UE8|G<;a4qSw-=KM+8*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_705566097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705566097L))
            info.setReturnValue(-852610246);
    }

    @Inject(at = @At("HEAD"), method = "scheduleTick()Z", cancellable = true)
    private void scheduleTick_705581938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705581938L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toPlace()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void toPlace__1265403146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1265403146L))
            info.setReturnValue(null);
    }


}

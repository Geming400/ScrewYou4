package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.DimensionPadding.class)
public class DimensionPadding_492456155Mixin {
        @Inject(at = @At("HEAD"), method = "bottom()I", cancellable = true)
    private void bottom_530718400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530718400L))
            info.setReturnValue(-1087956357);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1877968413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1877968413L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__643003821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-643003821L))
            info.setReturnValue("'g?SeaH䟚vK");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_530718896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530718896L))
            info.setReturnValue(-1699307035);
    }

    @Inject(at = @At("HEAD"), method = "top()I", cancellable = true)
    private void top_530718400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530718400L))
            info.setReturnValue(-1087956357);
    }

    @Inject(at = @At("HEAD"), method = "hasEqualTopAndBottom()Z", cancellable = true)
    private void hasEqualTopAndBottom_530734737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530734737L))
            info.setReturnValue(false);
    }


}

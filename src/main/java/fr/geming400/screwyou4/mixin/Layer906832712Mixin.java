package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.BlockColumnConfiguration.Layer.class)
public class Layer906832712Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2002622325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2002622325L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__228627263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-228627263L))
            info.setReturnValue("OBF*:Jie\u2BF7f|)-(\u6822p\u88CD\uD17D8\uA514|N^\u02DA!6Z4iSY-LSt\u8F8DIL2<8z^I2v@PI#|\u4477'z\uB154WyO\u2728p6>y>n\uA5EAx\"c`_Ga\u3E89r2\uB9D9%zM@\uA4B8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_945095454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(945095454L))
            info.setReturnValue(-894887856);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void state__1025873789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1025873789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void height__1562854191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1562854191L))
            info.setReturnValue(null);
    }


}

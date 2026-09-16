package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Aquifer.FluidStatus.class)
public class FluidStatus_310038511Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__598587758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-598587758L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1080462035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1080462035L))
            info.setReturnValue("A\"#H;h{'TTGO4A`hn\uB9F0v}\u6B18.`\u7A24{}{S\u3F06\u6411J4 \u0843_\u4D17Gl\u9C98\u1104M\u1721\"qiW+_r[\u743F 4K>\uD1FA\u6A96YKECwO:c^T.M#Xqd%B\u78C0(dda\uB12D7I\u2C45");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_867390601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867390601L))
            info.setReturnValue(-518780272);
    }

    @Inject(at = @At("HEAD"), method = "at(I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void at_638708464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(638708464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fluidType()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void fluidType_743216384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(743216384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fluidLevel()I", cancellable = true)
    private void fluidLevel__57835974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-57835974L))
            info.setReturnValue(1101435016);
    }


}

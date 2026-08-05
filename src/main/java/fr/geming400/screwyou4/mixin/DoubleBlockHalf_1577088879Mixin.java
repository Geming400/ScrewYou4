package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.DoubleBlockHalf.class)
public class DoubleBlockHalf_1577088879Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1947455389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1947455389L))
            info.setReturnValue(":0#}Z Eu7\uF907&?w\u0343]F)#VH\uFFDB{*bG}\u3BE9\uB007@wX\u995E[1e&\uA69A_\"[\u040Ao )eVvp-5-)\u2594=e:C");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/DoubleBlockHalf;", cancellable = true)
    private static void values_1507362332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1507362332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/DoubleBlockHalf;", cancellable = true)
    private static void valueOf_394089443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(394089443L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.DoubleBlockHalf.LOWER);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1665297500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1665297500L))
            info.setReturnValue(".j%C\u9626F]W9uNa?`#59_Yt:S:g%\"Rp\u9967\u06F58N%sN\uCF5D\u7EB5OxXf-7w+H\u5BAEe]\u937Cjrmgg(Mwkn<3Ql!enal`2\u662D\uB042\uCEA9\uC9DAH;0r1de:*C");
    }

    @Inject(at = @At("HEAD"), method = "getDirectionToOther()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getDirectionToOther__849226427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-849226427L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "getOtherHalf()Lnet/minecraft/world/level/block/state/properties/DoubleBlockHalf;", cancellable = true)
    private void getOtherHalf_1517392250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1517392250L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.DoubleBlockHalf.UPPER);
    }


}

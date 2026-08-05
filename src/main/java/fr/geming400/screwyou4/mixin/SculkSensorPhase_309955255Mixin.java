package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.SculkSensorPhase.class)
public class SculkSensorPhase_309955255Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1080378283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1080378283L))
            info.setReturnValue("pIID |#*e7sE[2*pmTwQ{D@[k{\uD401\"Jmkq\u08C5r\u3432L&'?");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/SculkSensorPhase;", cancellable = true)
    private static void values_461696894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(461696894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/SculkSensorPhase;", cancellable = true)
    private static void valueOf_309975703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309975703L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SculkSensorPhase.ACTIVE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_398163876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398163876L))
            info.setReturnValue("B.o?.M\uBEA2FC%}\u84FAobor,M#>)W:d@yB\u5CD5&nVhG+<B|<*U4y7.i)]Kek]tO4Ks!V5f");
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.StairsShape.class)
public class StairsShape1338233337Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2108656366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2108656366L))
            info.setReturnValue("^\u3529-\u19B7SS?r(/f<thzj\uCB06&!");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/StairsShape;", cancellable = true)
    private static void values__146464833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-146464833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/StairsShape;", cancellable = true)
    private static void valueOf__2071074554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2071074554L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.StairsShape.STRAIGHT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1426441959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426441959L))
            info.setReturnValue("$cmo Lei\u05E9l8oE%=\u3D53@\u29E8\u6925>J#Sbm*Af^");
    }


}

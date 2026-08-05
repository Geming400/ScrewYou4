package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.StairsShape.class)
public class StairsShape1338233337Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_202772866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202772866L))
            info.setReturnValue(",r38B<#XpLO!6>G|ONq]}J O+B锐t<CoIb늈Nl@$⌴팉#L#HL첉6a");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/StairsShape;", cancellable = true)
    private static void values__1981261791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1981261791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/StairsShape;", cancellable = true)
    private static void valueOf_1468418526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1468418526L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.StairsShape.OUTER_LEFT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_202772866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202772866L))
            info.setReturnValue(",r38B<#XpLO!6>G|ONq]}J O+B锐t<CoIb늈Nl@$⌴팉#L#HL첉6a");
    }


}

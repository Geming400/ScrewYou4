package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.RedstoneSide.class)
public class RedstoneSide_1127041193Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1897464221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897464221L))
            info.setReturnValue("wNzG#=u L;(T\u9400\u0FC1|CCyq\uA52D&9U#meT< ,j\uFC9E\uB214&4NG#M0<dn2 ^\u6E11lJ>Ut.]KFC");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/RedstoneSide;", cancellable = true)
    private static void values__501497438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-501497438L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/RedstoneSide;", cancellable = true)
    private static void valueOf__34856645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-34856645L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.RedstoneSide.SIDE);
    }

    @Inject(at = @At("HEAD"), method = "isConnected()Z", cancellable = true)
    private void isConnected_1262645440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262645440L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1215249814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1215249814L))
            info.setReturnValue("K;{r9xk1hUsCWN Q[L5\uCC3A):\u257D}|z?iGI\u019E\u0CB8@\uD563} e\u8EDF1(iUe'[=]\u8452r\u6ABF';zB'MuBL");
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.CreakingHeartState.class)
public class CreakingHeartState1069024793Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1839447822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1839447822L))
            info.setReturnValue("?M/+V%y\u6765\u7F89u\u052CMl*%9|c\u07E3;\u3513_s9pL#Km|'@1d,WJL\u0A2Bc=s=,\u2995Z#c#R};OY\uC9DBKA\uA4F36%tP");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/CreakingHeartState;", cancellable = true)
    private static void values__1277312559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1277312559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/CreakingHeartState;", cancellable = true)
    private static void valueOf__1052489046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1052489046L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.CreakingHeartState.AWAKE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1157233415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1157233415L))
            info.setReturnValue("\uB6FDK%&bB^N3b\u1C0E@c}L;IB<H=%F4\u9B11M}0\u3D67\u7923r!Kol\uA22FN\u9147%y\u8F4F%BI>vm8c^[\uD078_\u3F52WA");
    }


}

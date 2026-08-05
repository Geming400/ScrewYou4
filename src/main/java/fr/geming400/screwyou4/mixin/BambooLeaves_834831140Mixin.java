package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.BambooLeaves.class)
public class BambooLeaves_834831140Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1605254168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605254168L))
            info.setReturnValue("?\u2859\u12EF;g:iB ?aDQ<^]\u091C\u4D7EvX\uD392\u2AF7|Qj)K2Xb[aT8JRq\u23FAk\uB2833JMz;J$p{7\u959Es=B;\u55C7>H)e\u3730\u35C3W|[FTAM`S>\u8E1D\uB0C8&:fm\u22C2= \u4274V|p8DUG4");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/BambooLeaves;", cancellable = true)
    private static void values__325130440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-325130440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/BambooLeaves;", cancellable = true)
    private static void valueOf_141510353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141510353L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.BambooLeaves.NONE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_923039761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(923039761L))
            info.setReturnValue("\u60B0?: eE\u7999k#7o/g&&<\u84E0tL\u73E4;e\u628Fy-8q<g\u239D.;$\u5A55M\u5A43QqUt>$/<m..^&.lVL\u2756\u52D9N%ZYGhs'Z!t&Y-\u1DE1;}Wk_\u6169");
    }


}

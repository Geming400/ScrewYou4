package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.criteria.ObjectiveCriteria.RenderType.class)
public class RenderType10652422Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;", cancellable = true)
    private static void values_2042382390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042382390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;", cancellable = true)
    private static void valueOf_2137068403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2137068403L))
            info.setReturnValue(net.minecraft.world.scores.criteria.ObjectiveCriteria.RenderType.HEARTS);
    }

    @Inject(at = @At("HEAD"), method = "getId()Ljava/lang/String;", cancellable = true)
    private void getId__1124808049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1124808049L))
            info.setReturnValue("O{3*9>\"a(WF*9tk\uFF96//y\"\u52C8\u1ABAo%,+gJ{+^N.!l=\u8E9Dq6(?7E\u6B2AFT%\u4F7D^4\uAEB1d<]zBGu^>QXVAO\u7E48");
    }

    @Inject(at = @At("HEAD"), method = "byId(Ljava/lang/String;)Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;", cancellable = true)
    private static void byId_2137068403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2137068403L))
            info.setReturnValue(net.minecraft.world.scores.criteria.ObjectiveCriteria.RenderType.HEARTS);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__1124808049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1124808049L))
            info.setReturnValue("O{3*9>\"a(WF*9tk\uFF96//y\"\u52C8\u1ABAo%,+gJ{+^N.!l=\u8E9Dq6(?7E\u6B2AFT%\u4F7D^4\uAEB1d<]zBGu^>QXVAO\u7E48");
    }


}

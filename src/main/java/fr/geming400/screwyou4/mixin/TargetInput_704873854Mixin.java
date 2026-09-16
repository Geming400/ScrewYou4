package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostChainConfig.TargetInput.class)
public class TargetInput_704873854Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__203752415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-203752415L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1475297378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1475297378L))
            info.setReturnValue("\u38238@*\"xs0>B\u6CA0erGFi|F@\u73BC\uCF9D4\uFBB2qc,2+}QoS\u111AQ98/Yf/3\u3B3DZ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1262225944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262225944L))
            info.setReturnValue(654321341);
    }

    @Inject(at = @At("HEAD"), method = "referencedTargets()Ljava/util/Set;", cancellable = true)
    private void referencedTargets_1057203382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1057203382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useDepthBuffer()Z", cancellable = true)
    private void useDepthBuffer__814063656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-814063656L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "samplerName()Ljava/lang/String;", cancellable = true)
    private void samplerName_1781880697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781880697L))
            info.setReturnValue("\u513As'HuRq T]l#i\"<3)\uF957`svf\u5557`*12)v\"`}XO%hR^.x\u6ACA'>Aw!K\u0EC8?B5+Sm\uC477vl?rk9.\u7428KZM:8&V");
    }

    @Inject(at = @At("HEAD"), method = "targetId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void targetId__322754736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-322754736L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bilinear()Z", cancellable = true)
    private void bilinear_602868872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(602868872L))
            info.setReturnValue(true);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.MessageArgument.Part.class)
public class Part832779349Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__75846919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-75846919L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1603202874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1603202874L))
            info.setReturnValue("w0\u2460\u90BBD6HNz%\u3853GvNo\u3148\uB41F1\uAE54\uC9FE_R'k,rDqo\u8961Va'r[C'\u7BECm?V:\u4AFC\u9F58Ev2\u455BR|)\uCCB6\u6EC5e`FP?x82u{*EM`E/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1390131440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390131440L))
            info.setReturnValue(1072647700);
    }

    @Inject(at = @At("HEAD"), method = "end()I", cancellable = true)
    private void end__1789668800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1789668800L))
            info.setReturnValue(-1485527671);
    }

    @Inject(at = @At("HEAD"), method = "start()I", cancellable = true)
    private void start__793398503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-793398503L))
            info.setReturnValue(629553795);
    }

    @Inject(at = @At("HEAD"), method = "selector()Lnet/minecraft/commands/arguments/selector/EntitySelector;", cancellable = true)
    private void selector_473911644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(473911644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toComponent(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void toComponent__1252547996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1252547996L))
            info.setReturnValue(null);
    }


}

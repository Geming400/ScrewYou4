package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.input.CharacterEvent.class)
public class CharacterEvent_170851907Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__737774362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-737774362L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_941275431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(941275431L))
            info.setReturnValue(">ebk7+:\uD460-8)hqnwAm&%&\u466AE<o>[D-o>v|\u7D92%`em\uD14F!<QOv\"67SpJ)5#z`+aB");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_728203997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(728203997L))
            info.setReturnValue(-1560051369);
    }

    @Inject(at = @At("HEAD"), method = "codepoint()I", cancellable = true)
    private void codepoint__709664187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-709664187L))
            info.setReturnValue(-1715702897);
    }

    @Inject(at = @At("HEAD"), method = "isAllowedChatCharacter()Z", cancellable = true)
    private void isAllowedChatCharacter__1263679066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1263679066L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "codepointAsString()Ljava/lang/String;", cancellable = true)
    private void codepointAsString_1324463377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1324463377L))
            info.setReturnValue("\uD23EcS*`l0yihT\u0DDC\u4C18&l*I_]app[K\u30ADn66[u;m\u5AB6\uFA2C]_w}TY\u37A0\u05C1%\u9BCC\uB9AAZUs:ObFVBSXS\uB41A#xSFrEy>'o\u6FE5+hRt,\uC922d?&qB\u2F310s6s");
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.Custom.class)
public class Custom_1097580691Mixin {
        @Inject(at = @At("HEAD"), method = "payload()Ljava/util/Optional;", cancellable = true)
    private void payload_1343042112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1343042112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1811874347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1811874347L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__37879285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-37879285L))
            info.setReturnValue("qcBMe5V.'[$&꘦ScH>ibdRJ(1쩌刓,%墎@H+T⁵][hPg8;o,}icȼo\"࣍줺{Y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1135843432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1135843432L))
            info.setReturnValue(-2087779635);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1345485863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1345485863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private void action_757183994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(757183994L))
            info.setReturnValue(net.minecraft.network.chat.ClickEvent.Action.COPY_TO_CLIPBOARD);
    }


}

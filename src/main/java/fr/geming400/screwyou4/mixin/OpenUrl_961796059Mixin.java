package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.OpenUrl.class)
public class OpenUrl_961796059Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_53169790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53169790L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1732219583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1732219583L))
            info.setReturnValue("(5qC[!}eD=2o;\u1540F6\u3678rUz*%Y#4\u10E9\u477Em+F]m}!w|I6>e2$Xl'\u36622}\uFCEE\uBDD5n}9(|on|\\\"yjZHj+)YDag?2\u47F6o3%YOZ^6X\u1EDCckv$");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1519148149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1519148149L))
            info.setReturnValue(-1131905948);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private void action_1047925240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1047925240L))
            info.setReturnValue(net.minecraft.network.chat.ClickEvent.Action.SHOW_DIALOG);
    }

    @Inject(at = @At("HEAD"), method = "uri()Ljava/net/URI;", cancellable = true)
    private void uri__459289753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-459289753L))
            info.setReturnValue(null);
    }


}

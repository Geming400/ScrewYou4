package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.LoggedChatMessage.System.class)
public class System427278258Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/multiplayer/chat/LoggedChatEvent$Type;", cancellable = true)
    private void type_1748217040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1748217040L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.LoggedChatEvent.Type.SYSTEM);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1812790517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1812790517L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__708181717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-708181717L))
            info.setReturnValue("J\uFCE3'WrZU[\u9EA9Q%Hb\u2A80Y\uD4C3csF\u2F89>Aj\",#\u5E9BdP3T&4\"0K\u1A3F\u1F665pK\u4940q\uBE86Yfdu\u946DJ9oeb&V<S+_|\u6C69U3\u6F94gQ?R|8G=tWks\u1564!@I\u4EA0\u28DCX8Hf;T!yru");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_465541000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(465541000L))
            info.setReturnValue(-372669461);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void message__1749630907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749630907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timeStamp()Ljava/time/Instant;", cancellable = true)
    private void timeStamp_1524512458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1524512458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canReport(Ljava/util/UUID;)Z", cancellable = true)
    private void canReport_69726013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69726013L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toContentComponent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void toContentComponent__1749630907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749630907L))
            info.setReturnValue(null);
    }


}

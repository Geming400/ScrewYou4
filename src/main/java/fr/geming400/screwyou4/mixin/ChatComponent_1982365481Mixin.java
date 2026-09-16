package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.ChatComponent.class)
public class ChatComponent_1982365481Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1852681822(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1852681822L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVisibleMessageFilter(Ljava/util/function/Predicate;)V", cancellable = true)
    private void setVisibleMessageFilter__1074003845(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1074003845L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeight(D)I", cancellable = true)
    private static void getHeight_50998103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(50998103L))
            info.setReturnValue(231061859);
    }

    @Inject(at = @At("HEAD"), method = "addClientSystemMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void addClientSystemMessage_924762371(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(924762371L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openScreen(Lnet/minecraft/client/gui/components/ChatComponent$ChatMethod;Lnet/minecraft/client/gui/screens/ChatScreen$ChatConstructor;)V", cancellable = true)
    private void openScreen_476501624(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(476501624L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWidth(D)I", cancellable = true)
    private static void getWidth_2060273930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2060273930L))
            info.setReturnValue(319983398);
    }

    @Inject(at = @At("HEAD"), method = "captureClickableText(Lnet/minecraft/client/gui/ActiveTextCollector;IILnet/minecraft/client/gui/components/ChatComponent$DisplayMode;)V", cancellable = true)
    private void captureClickableText__1048482575(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1048482575L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLinesPerPage()I", cancellable = true)
    private void getLinesPerPage__890685653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-890685653L))
            info.setReturnValue(1337378122);
    }

    @Inject(at = @At("HEAD"), method = "deleteMessage(Lnet/minecraft/network/chat/MessageSignature;)V", cancellable = true)
    private void deleteMessage_86612059(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(86612059L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRecentChat()Lnet/minecraft/util/ArrayListDeque;", cancellable = true)
    private void getRecentChat__805060703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-805060703L))
            info.setReturnValue(new net.minecraft.util.ArrayListDeque());
    }

    @Inject(at = @At("HEAD"), method = "addRecentChat(Ljava/lang/String;)V", cancellable = true)
    private void addRecentChat_515320721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(515320721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "restoreState(Lnet/minecraft/client/gui/components/ChatComponent$State;)V", cancellable = true)
    private void restoreState_434223960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(434223960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addServerSystemMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void addServerSystemMessage_1954886779(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1954886779L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "discardDraft()V", cancellable = true)
    private void discardDraft_1275535384(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1275535384L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPlayerMessage(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/MessageSignature;Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;)V", cancellable = true)
    private void addPlayerMessage__78337023(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-78337023L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveAsDraft(Ljava/lang/String;)V", cancellable = true)
    private void saveAsDraft__1399424685(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1399424685L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetChatScroll()V", cancellable = true)
    private void resetChatScroll_354441063(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(354441063L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "preserveCurrentChatScreen()V", cancellable = true)
    private void preserveCurrentChatScreen__1886729942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1886729942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createScreen(Lnet/minecraft/client/gui/components/ChatComponent$ChatMethod;Lnet/minecraft/client/gui/screens/ChatScreen$ChatConstructor;)Lnet/minecraft/client/gui/screens/ChatScreen;", cancellable = true)
    private void createScreen__1830600117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1830600117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;IIILnet/minecraft/client/gui/components/ChatComponent$DisplayMode;Z)V", cancellable = true)
    private void extractRenderState_1746847811(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1746847811L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "restoreChatScreen()Lnet/minecraft/client/gui/screens/ChatScreen;", cancellable = true)
    private void restoreChatScreen_54688298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(54688298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isChatFocused()Z", cancellable = true)
    private void isChatFocused__1604780918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1604780918L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "clearMessages(Z)V", cancellable = true)
    private void clearMessages__596523554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-596523554L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scrollChat(I)V", cancellable = true)
    private void scrollChat_1636793945(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1636793945L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "storeState()Lnet/minecraft/client/gui/components/ChatComponent$State;", cancellable = true)
    private void storeState_1064364991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1064364991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultUnfocusedPct()D", cancellable = true)
    private static void defaultUnfocusedPct_1394532253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1394532253L))
            info.setReturnValue(2.1972990004346618E8D);
    }

    @Inject(at = @At("HEAD"), method = "rescaleChat()V", cancellable = true)
    private void rescaleChat_10087500(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(10087500L))
            info.cancel();
    }


}

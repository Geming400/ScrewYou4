package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.ChatComponent.class)
public class ChatComponent_1982365481Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2020640219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2020640219L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWidth(D)I", cancellable = true)
    private static void getWidth__1103314694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1103314694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isChatFocused()Z", cancellable = true)
    private void isChatFocused_2020644063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2020644063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "captureClickableText(Lnet/minecraft/client/gui/ActiveTextCollector;IILnet/minecraft/client/gui/components/ChatComponent$DisplayMode;)V", cancellable = true)
    private void captureClickableText__1023607320(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1023607320L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVisibleMessageFilter(Ljava/util/function/Predicate;)V", cancellable = true)
    private void setVisibleMessageFilter_2052722026(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2052722026L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLinesPerPage()I", cancellable = true)
    private void getLinesPerPage_2020627726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2020627726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addRecentChat(Ljava/lang/String;)V", cancellable = true)
    private void addRecentChat__1160240667(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1160240667L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "restoreState(Lnet/minecraft/client/gui/components/ChatComponent$State;)V", cancellable = true)
    private void restoreState_1327340533(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1327340533L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "preserveCurrentChatScreen()V", cancellable = true)
    private void preserveCurrentChatScreen_2020640219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2020640219L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveAsDraft(Ljava/lang/String;)V", cancellable = true)
    private void saveAsDraft__1160240667(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1160240667L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetChatScroll()V", cancellable = true)
    private void resetChatScroll_2020640219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2020640219L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deleteMessage(Lnet/minecraft/network/chat/MessageSignature;)V", cancellable = true)
    private void deleteMessage__2131338369(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2131338369L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "discardDraft()V", cancellable = true)
    private void discardDraft_2020640219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2020640219L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addServerSystemMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void addServerSystemMessage_81186543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(81186543L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createScreen(Lnet/minecraft/client/gui/components/ChatComponent$ChatMethod;Lnet/minecraft/client/gui/screens/ChatScreen$ChatConstructor;)Lnet/minecraft/client/gui/screens/ChatScreen;", cancellable = true)
    private void createScreen__1373516349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1373516349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecentChat()Lnet/minecraft/util/ArrayListDeque;", cancellable = true)
    private void getRecentChat_1845260298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1845260298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPlayerMessage(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/MessageSignature;Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;)V", cancellable = true)
    private void addPlayerMessage_2133894822(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2133894822L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "restoreChatScreen()Lnet/minecraft/client/gui/screens/ChatScreen;", cancellable = true)
    private void restoreChatScreen__603382020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-603382020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;IIILnet/minecraft/client/gui/components/ChatComponent$DisplayMode;Z)V", cancellable = true)
    private void extractRenderState_1164936809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1164936809L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearMessages(Z)V", cancellable = true)
    private void clearMessages__1082984987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1082984987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addClientSystemMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void addClientSystemMessage_81186543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(81186543L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "defaultUnfocusedPct()D", cancellable = true)
    private static void defaultUnfocusedPct_2020623169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2020623169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rescaleChat()V", cancellable = true)
    private void rescaleChat_2020640219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2020640219L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openScreen(Lnet/minecraft/client/gui/components/ChatComponent$ChatMethod;Lnet/minecraft/client/gui/screens/ChatScreen$ChatConstructor;)V", cancellable = true)
    private void openScreen_815448866(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(815448866L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "storeState()Lnet/minecraft/client/gui/components/ChatComponent$State;", cancellable = true)
    private void storeState_165559791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165559791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scrollChat(I)V", cancellable = true)
    private void scrollChat__1098684844(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1098684844L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeight(D)I", cancellable = true)
    private static void getHeight__1103314694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1103314694L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.PlayerEntry.class)
public class PlayerEntry205639075Mixin {
        @Inject(at = @At("HEAD"), method = "children()Ljava/util/List;", cancellable = true)
    private void children_1420305490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420305490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRemoved()Z", cancellable = true)
    private void isRemoved__994772668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-994772668L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setRemoved(Z)V", cancellable = true)
    private void setRemoved_867874686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(867874686L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_720396559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(720396559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "narratables()Ljava/util/List;", cancellable = true)
    private void narratables_1925860294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1925860294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isChatReportable()Z", cancellable = true)
    private void isChatReportable_1059564426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059564426L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerName()Ljava/lang/String;", cancellable = true)
    private void getPlayerName_937191598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937191598L))
            info.setReturnValue("m<? (0\u1007-Er,zr\u3EF4,kB\u507F2P2#D0[nCm3\u52C4gGN@\u68FCJN3,*ddj\u73FB\uB489ge-x3\u4320\u9A378&OR\u645Bk22}4D\uCEDE|Gr[\u3E67eBQcoe%I\u5272\u34FF,ym)!#t,v");
    }

    @Inject(at = @At("HEAD"), method = "getPlayerId()Ljava/util/UUID;", cancellable = true)
    private void getPlayerId__418969592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-418969592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSkinGetter()Ljava/util/function/Supplier;", cancellable = true)
    private void getSkinGetter__247761466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-247761466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasRecentMessages()Z", cancellable = true)
    private void hasRecentMessages_511644153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511644153L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "refreshHasDraftReport(Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;)V", cancellable = true)
    private void refreshHasDraftReport__1769699399(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1769699399L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setHasRecentMessages(Z)V", cancellable = true)
    private void setHasRecentMessages_711800543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(711800543L))
            info.cancel();
    }


}

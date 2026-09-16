package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelSummary.SymlinkLevelSummary.class)
public class SymlinkLevelSummary_929434927Mixin {
        @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__962669008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-962669008L))
            info.setReturnValue(1507967034);
    }

    @Inject(at = @At("HEAD"), method = "getInfo()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getInfo__200725019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-200725019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelName()Ljava/lang/String;", cancellable = true)
    private void getLevelName__722234000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-722234000L))
            info.setReturnValue("![<OWWb\u96FA\u90A9x\u3381k:[dL\uC8DC\u2237Y\uC224zd\u9BB7sEjpBIc'@=u`f$;5M^G\u6D13{O");
    }

    @Inject(at = @At("HEAD"), method = "isDisabled()Z", cancellable = true)
    private void isDisabled__1623954209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623954209L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canEdit()Z", cancellable = true)
    private void canEdit__1738582741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1738582741L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canUpload()Z", cancellable = true)
    private void canUpload__572468332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-572468332L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "primaryActionActive()Z", cancellable = true)
    private void primaryActionActive_1005853095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1005853095L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canRecreate()Z", cancellable = true)
    private void canRecreate__625425050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-625425050L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "primaryActionMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void primaryActionMessage__1657712368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657712368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLastPlayed()J", cancellable = true)
    private void getLastPlayed__1538349770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1538349770L))
            info.setReturnValue(2060961419763186153L);
    }


}

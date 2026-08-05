package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugScreenEntryStatus.class)
public class DebugScreenEntryStatus_827343963Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/components/debug/DebugScreenEntryStatus;", cancellable = true)
    private static void values_1356800995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1356800995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/components/debug/DebugScreenEntryStatus;", cancellable = true)
    private static void valueOf_1451487008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1451487008L))
            info.setReturnValue(net.minecraft.client.gui.components.debug.DebugScreenEntryStatus.ALWAYS_ON);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__308116509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-308116509L))
            info.setReturnValue("Fm7v`BZ9_F`l殲<蘛#@pFEgC&@!⠑3啉偰Fc+Zd{驋FHϰV#➜leQs!핓 {:zk襰Qp:XT@y겜Ff_>닖쵓e`Iba3P풽嶅xxQ*m_祟sab");
    }


}

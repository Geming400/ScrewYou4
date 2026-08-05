package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.UpgradeProgress.Type.class)
public class Type_196407623Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/worldupdate/UpgradeProgress$Type;", cancellable = true)
    private static void values__1997904665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1997904665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/worldupdate/UpgradeProgress$Type;", cancellable = true)
    private static void valueOf_386603658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(386603658L))
            info.setReturnValue(net.minecraft.util.worldupdate.UpgradeProgress.Type.LEGACY_STRUCTURES);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void label__1980501543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980501543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__939052849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-939052849L))
            info.setReturnValue("&K0n&CQQ촴\"kdd@Bf藏awU2.r6c8㿜[Zo⌐᪘h}di:p1`BBJ襅:kkI6) ubH'N.vgG暑))obG9z;0‱帋.");
    }


}

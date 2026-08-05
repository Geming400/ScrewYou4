package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.UpgradeProgress.Type.class)
public class Type_196407623Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/worldupdate/UpgradeProgress$Type;", cancellable = true)
    private static void values__1236864119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1236864119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/worldupdate/UpgradeProgress$Type;", cancellable = true)
    private static void valueOf_94654050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(94654050L))
            info.setReturnValue(net.minecraft.util.worldupdate.UpgradeProgress.Type.FILES);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void label_808681421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(808681421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_284616244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(284616244L))
            info.setReturnValue("\u3758e_w4@_%ybR.d/,o)QWzf\u7B62\uD040`1yt#>3u");
    }


}

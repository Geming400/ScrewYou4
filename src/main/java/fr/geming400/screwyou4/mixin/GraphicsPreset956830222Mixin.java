package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.GraphicsPreset.class)
public class GraphicsPreset956830222Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/GraphicsPreset;", cancellable = true)
    private static void values__237016969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-237016969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/GraphicsPreset;", cancellable = true)
    private static void valueOf__1645362150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1645362150L))
            info.setReturnValue(net.minecraft.client.GraphicsPreset.FANCY);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/client/Minecraft;)V", cancellable = true)
    private void apply_1200574899(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1200574899L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getKey()Ljava/lang/String;", cancellable = true)
    private void getKey__178630249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-178630249L))
            info.setReturnValue("<|䡤^6Rq?य3}5涩NQ=XtCJvzC90x豐'鹊fL$l跋扖?GqLfR9+^f;^2[G&Reh42'wKQ'gO긶VG03I(1h;<*9vm.R&k,*瞸");
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__178630249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-178630249L))
            info.setReturnValue("<|䡤^6Rq?य3}5涩NQ=XtCJvzC90x豐'鹊fL$l跋扖?GqLfR9+^f;^2[G&Reh42'wKQ'gO긶VG03I(1h;<*9vm.R&k,*瞸");
    }


}

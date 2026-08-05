package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.language.LanguageManager.class)
public class LanguageManager531970951Mixin {
        @Inject(at = @At("HEAD"), method = "getLanguage(Ljava/lang/String;)Lnet/minecraft/client/resources/language/LanguageInfo;", cancellable = true)
    private void getLanguage__1374907064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1374907064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onResourceManagerReload(Lnet/minecraft/server/packs/resources/ResourceManager;)V", cancellable = true)
    private void onResourceManagerReload_630992833(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(630992833L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Ljava/lang/String;)V", cancellable = true)
    private void setSelected_1684332100(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1684332100L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelected()Ljava/lang/String;", cancellable = true)
    private void getSelected__603489520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-603489520L))
            info.setReturnValue("]涎w頵z'");
    }

    @Inject(at = @At("HEAD"), method = "getLanguages()Ljava/util/SortedMap;", cancellable = true)
    private void getLanguages__1559817396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1559817396L))
            info.setReturnValue(null);
    }


}

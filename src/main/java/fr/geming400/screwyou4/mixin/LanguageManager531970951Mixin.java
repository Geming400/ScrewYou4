package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.language.LanguageManager.class)
public class LanguageManager531970951Mixin {
        @Inject(at = @At("HEAD"), method = "getLanguage(Ljava/lang/String;)Lnet/minecraft/client/resources/language/LanguageInfo;", cancellable = true)
    private void getLanguage__1263849194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1263849194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Ljava/lang/String;)V", cancellable = true)
    private void setSelected_1239833735(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1239833735L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelected()Ljava/lang/String;", cancellable = true)
    private void getSelected_1894701153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894701153L))
            info.setReturnValue("lcGL5\u725Ef\u1E87,\uBD41&O\u70BD\u37B59M8");
    }

    @Inject(at = @At("HEAD"), method = "onResourceManagerReload(Lnet/minecraft/server/packs/resources/ResourceManager;)V", cancellable = true)
    private void onResourceManagerReload_785215112(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(785215112L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLanguages()Ljava/util/SortedMap;", cancellable = true)
    private void getLanguages_288077191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(288077191L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ReloadableServerRegistries.LoadResult.class)
public class LoadResult845901312Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__62724956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-62724956L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1616324837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616324837L))
            info.setReturnValue("\uA838aWaE3F{yn\uA868C9KY\u20D5boq;Ntw\u508Fh\uFF1BlHcFL\u46B9)\u9F3B\u4815T0-\uAC144[;vn(g\u2051sL*,-\u27BCJOD]1_YnEa%fu\uAE97\u0706Svz>Ag//./T\u9118/ahw\u046A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1403253403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1403253403L))
            info.setReturnValue(1760793216);
    }

    @Inject(at = @At("HEAD"), method = "layers()Lnet/minecraft/core/LayeredRegistryAccess;", cancellable = true)
    private void layers_1058747195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1058747195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lookupWithUpdatedTags()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void lookupWithUpdatedTags__460245297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-460245297L))
            info.setReturnValue(null);
    }


}

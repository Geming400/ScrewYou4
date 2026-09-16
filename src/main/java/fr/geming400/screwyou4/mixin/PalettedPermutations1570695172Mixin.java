package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.atlas.sources.PalettedPermutations.class)
public class PalettedPermutations1570695172Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/client/renderer/texture/atlas/SpriteSource$Output;)V", cancellable = true)
    private void run_1113218529(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1113218529L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_662068904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(662068904L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1953848599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1953848599L))
            info.setReturnValue("(\u626C$;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2128047263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2128047263L))
            info.setReturnValue(571620507);
    }

    @Inject(at = @At("HEAD"), method = "separator()Ljava/lang/String;", cancellable = true)
    private void separator__2099076942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2099076942L))
            info.setReturnValue("aEjyB[9.kHB2F9x[s^>bS*\u37E7`d9\u0251u\uCD87v.uUDJgx(&!DY\u0D66Bn\u6FD03Z\u2188R55_4c'\uC7FB\u93E100vE\u4F8BOQlk;*naQfG[{nRmJI\u27DA?\u4EAAmt\u666E\u9F62<d");
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1657826870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657826870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paletteKey()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void paletteKey__1558073041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1558073041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "permutations()Ljava/util/Map;", cancellable = true)
    private void permutations__940127393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-940127393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textures()Ljava/util/List;", cancellable = true)
    private void textures_810096876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810096876L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V99.class)
public class V991947106376Mixin {
        @Inject(at = @At("HEAD"), method = "sign(Lcom/mojang/datafixers/schemas/Schema;)Lcom/mojang/datafixers/types/templates/TypeTemplate;", cancellable = true)
    private static void sign__801445859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-801445859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerTypes(Lcom/mojang/datafixers/schemas/Schema;Ljava/util/Map;Ljava/util/Map;)V", cancellable = true)
    private void registerTypes__6792985(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-6792985L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerEntities__115128708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-115128708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerBlockEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerBlockEntities__115128708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-115128708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemStackTag(Lcom/mojang/datafixers/schemas/Schema;)Lcom/mojang/datafixers/types/templates/TypeTemplate;", cancellable = true)
    private static void itemStackTag__801445859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-801445859L))
            info.setReturnValue(null);
    }


}

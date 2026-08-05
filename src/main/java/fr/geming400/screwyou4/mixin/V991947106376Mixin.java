package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V99.class)
public class V991947106376Mixin {
        @Inject(at = @At("HEAD"), method = "sign(Lcom/mojang/datafixers/schemas/Schema;)Lcom/mojang/datafixers/types/templates/TypeTemplate;", cancellable = true)
    private static void sign_2131064090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131064090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerEntities_1283820408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1283820408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerBlockEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerBlockEntities__877674671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-877674671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerTypes(Lcom/mojang/datafixers/schemas/Schema;Ljava/util/Map;Ljava/util/Map;)V", cancellable = true)
    private void registerTypes_1908886033(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1908886033L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "itemStackTag(Lcom/mojang/datafixers/schemas/Schema;)Lcom/mojang/datafixers/types/templates/TypeTemplate;", cancellable = true)
    private static void itemStackTag__1593219710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1593219710L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V704.class)
public class V704_1558942327Mixin {
        @Inject(at = @At("HEAD"), method = "registerTypes(Lcom/mojang/datafixers/schemas/Schema;Ljava/util/Map;Ljava/util/Map;)V", cancellable = true)
    private void registerTypes__394957035(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-394957035L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerBlockEntities(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/Map;", cancellable = true)
    private void registerBlockEntities__503292758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503292758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChoiceType(Lcom/mojang/datafixers/DSL$TypeReference;Ljava/lang/String;)Lcom/mojang/datafixers/types/Type;", cancellable = true)
    private void getChoiceType__146306413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-146306413L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.model.ModelTemplate.class)
public class ModelTemplate_1274582187Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void create_1051641584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1051641584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/item/Item;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void create__1396746809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1396746809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void create__840197960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-840197960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultModelLocation(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getDefaultModelLocation_2052395926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2052395926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWithSuffix(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createWithSuffix__172921289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-172921289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWithOverride(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createWithOverride__609586212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609586212L))
            info.setReturnValue(null);
    }


}

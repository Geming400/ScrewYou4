package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.model.ModelTemplate.class)
public class ModelTemplate_1274582187Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void create_175121652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(175121652L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/item/Item;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void create_122963267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(122963267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void create_155667508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(155667508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWithSuffix(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createWithSuffix__675485334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-675485334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultModelLocation(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getDefaultModelLocation_237782441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(237782441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWithOverride(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createWithOverride__675485334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-675485334L))
            info.setReturnValue(null);
    }


}

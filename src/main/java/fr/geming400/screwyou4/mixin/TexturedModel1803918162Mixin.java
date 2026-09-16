package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.model.TexturedModel.class)
public class TexturedModel1803918162Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/block/Block;Ljava/util/function/BiConsumer;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void create__1242175078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1242175078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDefault(Ljava/util/function/Function;Lnet/minecraft/client/data/models/model/ModelTemplate;)Lnet/minecraft/client/data/models/model/TexturedModel$Provider;", cancellable = true)
    private static void createDefault__87905006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-87905006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTemplate()Lnet/minecraft/client/data/models/model/ModelTemplate;", cancellable = true)
    private void getTemplate_1541798179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1541798179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWithSuffix(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;Ljava/util/function/BiConsumer;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createWithSuffix__304456965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-304456965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateTextures(Ljava/util/function/Consumer;)Lnet/minecraft/client/data/models/model/TexturedModel;", cancellable = true)
    private void updateTextures__1981654101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1981654101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAllSame(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TexturedModel;", cancellable = true)
    private static void createAllSame_615773595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(615773595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapping()Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void getMapping__1234679947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1234679947L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }


}

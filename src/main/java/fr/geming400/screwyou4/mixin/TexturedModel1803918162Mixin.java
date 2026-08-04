package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.model.TexturedModel.class)
public class TexturedModel1803918162Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/block/Block;Ljava/util/function/BiConsumer;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void create_1751679390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1751679390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateTextures(Ljava/util/function/Consumer;)Lnet/minecraft/client/data/models/model/TexturedModel;", cancellable = true)
    private void updateTextures_1625803628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1625803628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDefault(Ljava/util/function/Function;Lnet/minecraft/client/data/models/model/ModelTemplate;)Lnet/minecraft/client/data/models/model/TexturedModel$Provider;", cancellable = true)
    private static void createDefault_1164180781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164180781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWithSuffix(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;Ljava/util/function/BiConsumer;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createWithSuffix__550325976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-550325976L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTemplate()Lnet/minecraft/client/data/models/model/ModelTemplate;", cancellable = true)
    private void getTemplate__1804715213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1804715213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapping()Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void getMapping__1127916787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127916787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAllSame(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TexturedModel;", cancellable = true)
    private static void createAllSame__1137305968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1137305968L))
            info.setReturnValue(null);
    }


}

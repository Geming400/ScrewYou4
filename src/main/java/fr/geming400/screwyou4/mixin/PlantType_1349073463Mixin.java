package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.BlockModelGenerators.PlantType.class)
public class PlantType_1349073463Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;", cancellable = true)
    private static void values_1811718862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1811718862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;", cancellable = true)
    private static void valueOf__718045145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-718045145L))
            info.setReturnValue(net.minecraft.client.data.models.BlockModelGenerators.PlantType.TINTED);
    }

    @Inject(at = @At("HEAD"), method = "getTextureMapping(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void getTextureMapping_607564578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(607564578L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "getCrossPot()Lnet/minecraft/client/data/models/model/ModelTemplate;", cancellable = true)
    private void getCrossPot__2042321470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2042321470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlantTextureMapping(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void getPlantTextureMapping__1659940223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1659940223L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "createItemModel(Lnet/minecraft/client/data/models/BlockModelGenerators;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createItemModel_1599206778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1599206778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCross()Lnet/minecraft/client/data/models/model/ModelTemplate;", cancellable = true)
    private void getCross__206637023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-206637023L))
            info.setReturnValue(null);
    }


}

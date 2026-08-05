package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.ModelBakery.MissingModels.class)
public class MissingModels1570782175Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1338672862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338672862L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_435322200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(435322200L))
            info.setReturnValue("vZ콾JwNaẾm5+XꛗGkਝW8('P{Zwe0䆘$粧4O4^!좿mHE\"j>FV泞GH뵯i:+퉚n%.㠯ㄗ1;䴙8`|IrE*fM`xP⾧:,9n3Y&^9EOv䧯o ᄼR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1609044917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1609044917L))
            info.setReturnValue(128256716);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel;", cancellable = true)
    private void block__1216304161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1216304161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/client/renderer/item/MissingItemModel;", cancellable = true)
    private void item__1058343629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1058343629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/resources/model/ResolvedModel;Lnet/minecraft/client/resources/model/sprite/MaterialBaker;Lnet/minecraft/client/resources/model/ModelBaker$Interner;)Lnet/minecraft/client/resources/model/ModelBakery$MissingModels;", cancellable = true)
    private static void bake_398084771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398084771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fluid()Lnet/minecraft/client/renderer/block/FluidModel;", cancellable = true)
    private void fluid__1395986448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1395986448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockPart()Lnet/minecraft/client/renderer/block/dispatch/BlockStateModelPart;", cancellable = true)
    private void blockPart__1961354388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1961354388L))
            info.setReturnValue(null);
    }


}

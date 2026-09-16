package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.ModelBakery.MissingModels.class)
public class MissingModels1570782175Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_662155907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(662155907L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1953761596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1953761596L))
            info.setReturnValue(":\uFFE81n\u4251fa\u32AA.vOa\u22B7ff\u06D60W] NzYTF{ib<K:*BjW@e\u961E8WmPK.JIBKZ[YC4#_U-\u23B0]@#X\u4C25KB\u7D6BB?SuE$84maSh-1X)|r92Ib\u1817z/|(Pf:a");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2128134266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2128134266L))
            info.setReturnValue(-420071536);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel;", cancellable = true)
    private void block__1482122964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482122964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/client/renderer/item/MissingItemModel;", cancellable = true)
    private void item__1920036480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1920036480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockPart()Lnet/minecraft/client/renderer/block/dispatch/BlockStateModelPart;", cancellable = true)
    private void blockPart__75853428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-75853428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/resources/model/ResolvedModel;Lnet/minecraft/client/resources/model/sprite/MaterialBaker;Lnet/minecraft/client/resources/model/ModelBaker$Interner;)Lnet/minecraft/client/resources/model/ModelBakery$MissingModels;", cancellable = true)
    private static void bake__291878550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-291878550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fluid()Lnet/minecraft/client/renderer/block/FluidModel;", cancellable = true)
    private void fluid__328156998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-328156998L))
            info.setReturnValue(null);
    }


}

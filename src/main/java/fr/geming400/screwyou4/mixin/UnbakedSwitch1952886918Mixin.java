package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.SelectItemModel.UnbakedSwitch.class)
public class UnbakedSwitch1952886918Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__956568119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-956568119L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_817426943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(817426943L))
            info.setReturnValue(";qT&v7p^JLQ0KT<p\u06BBwh>snqyue:nb,f.nivW,Px{j0|'#YVicUaB'pQ& \u9550mGo:\u473B[k;\u842EG\u742AcWe`\u2D310");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1991149660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1991149660L))
            info.setReturnValue(456720344);
    }

    @Inject(at = @At("HEAD"), method = "property()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty;", cancellable = true)
    private void property__518438660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-518438660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cases()Ljava/util/List;", cancellable = true)
    private void cases__715743562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-715743562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;Lnet/minecraft/client/renderer/item/ItemModel;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake__1084180510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1084180510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_1903092988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1903092988L))
            info.cancel();
    }


}

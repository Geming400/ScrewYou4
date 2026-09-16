package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.EquipmentClientInfo.class)
public class EquipmentClientInfo875936521Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__32689747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-32689747L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1646360046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1646360046L))
            info.setReturnValue("zO_]3ZXy U\u3D98O/?(\u0918hl^X>/\u5804owN3@#`x_|]4\u70950l-u>tU#9;TP2;\u5781gV+\u4DE0$(x833%i\u53E3HG");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1433288612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1433288612L))
            info.setReturnValue(1900865101);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/client/resources/model/EquipmentClientInfo$Builder;", cancellable = true)
    private static void builder_1728124684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1728124684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "layers()Ljava/util/Map;", cancellable = true)
    private void layers__877270673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-877270673L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLayers(Lnet/minecraft/client/resources/model/EquipmentClientInfo$LayerType;)Ljava/util/List;", cancellable = true)
    private void getLayers_949623728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949623728L))
            info.setReturnValue(null);
    }


}

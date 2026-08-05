package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.MipmapStrategy.class)
public class MipmapStrategy_1960073321Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/texture/MipmapStrategy;", cancellable = true)
    private static void values_438432796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(438432796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/texture/MipmapStrategy;", cancellable = true)
    private static void valueOf_1343746777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1343746777L))
            info.setReturnValue(net.minecraft.client.renderer.texture.MipmapStrategy.MEAN);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_824612849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(824612849L))
            info.setReturnValue("RKpi\u65BD\u631E;Qz%\uD0F70y\uBA15I(_}OLQ9Ha\uFBFD\u5A33\u9689})O");
    }


}

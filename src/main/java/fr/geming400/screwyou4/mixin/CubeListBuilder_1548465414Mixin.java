package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.builders.CubeListBuilder.class)
public class CubeListBuilder_1548465414Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private static void create_184460185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(184460185L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "mirror()Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void mirror__503141852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503141852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mirror(Z)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void mirror_141320764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141320764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addBox(FFFFFFLnet/minecraft/client/model/geom/builders/CubeDeformation;FF)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox_782463809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(782463809L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addBox(FFFFFFZ)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox_1570605809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570605809L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addBox(Ljava/lang/String;FFFFFFLnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox__1725205065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1725205065L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addBox(FFFFFFLnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox__873611007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873611007L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addBox(Ljava/lang/String;FFFFFF)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox__386884859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-386884859L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addBox(Ljava/lang/String;FFFIIIII)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox_1353827298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1353827298L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addBox(FFFFFF)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox_1482626767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1482626767L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addBox(FFFFFFLjava/util/Set;)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox_1471365350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471365350L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addBox(Ljava/lang/String;FFFIIILnet/minecraft/client/model/geom/builders/CubeDeformation;II)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox__1525132332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1525132332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texOffs(II)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void texOffs__652838608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-652838608L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "getCubes()Ljava/util/List;", cancellable = true)
    private void getCubes__56956835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-56956835L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.builders.CubeListBuilder.class)
public class CubeListBuilder_1548465414Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private static void create__93662307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-93662307L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "mirror()Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void mirror__93662555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-93662555L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "mirror(Z)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void mirror__49722917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-49722917L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "texOffs(II)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void texOffs_1233946501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1233946501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addBox(FFFFFFLnet/minecraft/client/model/geom/builders/CubeDeformation;FF)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox__1892788777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892788777L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addBox(FFFFFFZ)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox__210426341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-210426341L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addBox(FFFFFFLnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox__304328425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-304328425L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addBox(Ljava/lang/String;FFFFFF)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox_1875999003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875999003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addBox(Ljava/lang/String;FFFIIIII)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox__1563200392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1563200392L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addBox(Ljava/lang/String;FFFIIILnet/minecraft/client/model/geom/builders/CubeDeformation;II)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox__1555825430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1555825430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addBox(FFFFFF)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox_1425174117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1425174117L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addBox(FFFFFFLjava/util/Set;)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox_10422928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(10422928L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.CubeListBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addBox(Ljava/lang/String;FFFFFFLnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/CubeListBuilder;", cancellable = true)
    private void addBox__549819315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-549819315L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCubes()Ljava/util/List;", cancellable = true)
    private void getCubes__1120165067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1120165067L))
            info.setReturnValue(null);
    }


}

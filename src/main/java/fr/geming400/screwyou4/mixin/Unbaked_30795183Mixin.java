package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.ChestSpecialRenderer.Unbaked.class)
public class Unbaked_30795183Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1364455472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1364455472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__877831086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-877831086L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_801218707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801218707L))
            info.setReturnValue("\u1BBCiNjqEy&_s\"A A>;2\"!kc`j+\uC9C0]wbI3EBg\u8F4E%%\uA2A9e{w8fc9H3\u0A70`M393FlJ\uCCC3e,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_588147273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(588147273L))
            info.setReturnValue(-1012261542);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake_1203597563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1203597563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/ChestSpecialRenderer;", cancellable = true)
    private void bake__499291213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-499291213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chestType()Lnet/minecraft/world/level/block/state/properties/ChestType;", cancellable = true)
    private void chestType_24375964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(24375964L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.ChestType.LEFT);
    }

    @Inject(at = @At("HEAD"), method = "texture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texture_861996816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(861996816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openness()F", cancellable = true)
    private void openness__1151905456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1151905456L))
            info.setReturnValue(5.357611E8F);
    }


}

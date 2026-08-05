package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.RailShape.class)
public class RailShape_1807557007Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_672096535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672096535L))
            info.setReturnValue("\u1B80n\u62FBN\u6586)]\u44FC-+W?FeJ\u35BE\u9D95Up=l0y('\u4367o2W>W)[/-=Z\u6E8E\u484F.P#?ehH\uA237\u3DD6jgS1ux9J=\u7941S>'\u17A3\u928A&^Q@S_d/fqBT=");
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_672096535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672096535L))
            info.setReturnValue("\u1B80n\u62FBN\u6586)]\u44FC-+W?FeJ\u35BE\u9D95Up=l0y('\u4367o2W>W)[/-=Z\u6E8E\u484F.P#?ehH\uA237\u3DD6jgS1ux9J=\u7941S>'\u17A3\u928A&^Q@S_d/fqBT=");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/RailShape;", cancellable = true)
    private static void values__1723027330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1723027330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/RailShape;", cancellable = true)
    private static void valueOf_1078324603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078324603L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.RailShape.EAST_WEST);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_672096535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672096535L))
            info.setReturnValue("\u1B80n\u62FBN\u6586)]\u44FC-+W?FeJ\u35BE\u9D95Up=l0y('\u4367o2W>W)[/-=Z\u6E8E\u484F.P#?ehH\uA237\u3DD6jgS1ux9J=\u7941S>'\u17A3\u928A&^Q@S_d/fqBT=");
    }

    @Inject(at = @At("HEAD"), method = "isSlope()Z", cancellable = true)
    private void isSlope_1845835589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1845835589L))
            info.setReturnValue(false);
    }


}

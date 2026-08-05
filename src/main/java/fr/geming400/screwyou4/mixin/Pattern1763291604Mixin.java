package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fish.TropicalFish.Pattern.class)
public class Pattern1763291604Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/world/entity/animal/fish/TropicalFish$Base;", cancellable = true)
    private void base_846737657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846737657L))
            info.setReturnValue(net.minecraft.world.entity.animal.fish.TropicalFish.Base.LARGE);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/fish/TropicalFish$Pattern;", cancellable = true)
    private static void values_371649586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371649586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/fish/TropicalFish$Pattern;", cancellable = true)
    private static void valueOf_1972133387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972133387L))
            info.setReturnValue(net.minecraft.world.entity.animal.fish.TropicalFish.Pattern.SPOTTY);
    }

    @Inject(at = @At("HEAD"), method = "displayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void displayName__1221250924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1221250924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/fish/TropicalFish$Pattern;", cancellable = true)
    private static void byId__1924563596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1924563596L))
            info.setReturnValue(net.minecraft.world.entity.animal.fish.TropicalFish.Pattern.DASHER);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1851500226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1851500226L))
            info.setReturnValue("ehz&-Ee7CAAG\u5C7345p6m;;?x>?@vr\uADA7}l+Ex|\u6516:kM8,E):d(^E|5?|m\u8A61w4^4\u9316\uB313k-$xy?tti;eT\u6814'8pz*c\u96D5L\u5898\uB03A-a.ys\u90C98x^H2\u748F{\u76FC");
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__611928443(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-611928443L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPackedId()I", cancellable = true)
    private void getPackedId__288881615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-288881615L))
            info.setReturnValue(-928460645);
    }


}

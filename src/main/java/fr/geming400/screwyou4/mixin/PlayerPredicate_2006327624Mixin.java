package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.PlayerPredicate.class)
public class PlayerPredicate_2006327624Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__903127414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-903127414L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_870867648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870867648L))
            info.setReturnValue("]q7.T*\u18581F4w \u471CL\u8FFDjo\u6132V!RJ\u86C8hJV0/&s9L@d\u561Afct\u62282g%Y+UG2Q");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2044590365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2044590365L))
            info.setReturnValue(-1600218387);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches_52135712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(52135712L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "input()Ljava/util/Optional;", cancellable = true)
    private void input__2043178251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2043178251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void level_1855092565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1855092565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lookingAt()Ljava/util/Optional;", cancellable = true)
    private void lookingAt__2043178251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2043178251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "food()Lnet/minecraft/advancements/predicates/FoodPredicate;", cancellable = true)
    private void food_909822557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(909822557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipes()Lit/unimi/dsi/fastutil/objects/Object2BooleanMap;", cancellable = true)
    private void recipes__1668896172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1668896172L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameType()Lnet/minecraft/advancements/predicates/GameTypePredicate;", cancellable = true)
    private void gameType_1292436555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1292436555L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stats()Ljava/util/List;", cancellable = true)
    private void stats__662302857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-662302857L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "advancements()Ljava/util/Map;", cancellable = true)
    private void advancements_1703983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703983L))
            info.setReturnValue(null);
    }


}
